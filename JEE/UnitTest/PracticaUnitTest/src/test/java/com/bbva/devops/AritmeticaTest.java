package com.bbva.devops;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import static org.powermock.api.mockito.PowerMockito.verifyPrivate;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

//el siguiente tag nos ayuda a hacer uso de los mocks, amplia las capacidades de JUnit
@RunWith(PowerMockRunner.class)
@PrepareForTest(Aritmetica.class)
public class AritmeticaTest {

    //indica que es nuestra clase principal y que todos los mocks que encuentre los instancie a esta clase  
    @InjectMocks
    Aritmetica aritmetica;
    
    @Mock
    CloudService cloudService;
    
    @Before
    public void beforeEachTest() {
        //permitira hacer mocks parciales
        aritmetica = PowerMockito.spy(new Aritmetica());
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testCloudOp() {
        
        //define el comportamiento y la salida que este tendra
        when(cloudService.getValue()).thenReturn(1);
        Assert.assertEquals(4, aritmetica.cloudOp(3, 1), 0);
    }
    
    @Test
    public void testSpyCloudOp() {
        int getServiceValueMock = 1;
        float anyNumber = 10;
        float val1 = 16;
        float val2 = 28;
        int wantedNumberOfInvocations = 1;
        //define el comportamiento y la salida que tendra la interface
        when(cloudService.getValue()).thenReturn(getServiceValueMock);
        //define el comportamiento y salida que tendra el metodo a llamar
        when(aritmetica.suma(anyFloat(), anyFloat())).thenReturn(anyNumber);
        aritmetica.cloudOp(val1, val2);
        verify(aritmetica, times(wantedNumberOfInvocations)).suma(anyFloat(),anyFloat());
    }
    
    // Metodo privado
    @Test
    public void testGetDefaultNumber() throws Exception {
        int expectedValue = Aritmetica.class.hashCode();
        int value = Whitebox.invokeMethod(aritmetica, "getDefaultNumber");
        assertEquals(expectedValue, value);
    }
    
    @Test
    public void testSumValues() throws Exception {
        int expectedValue = 10;
        List<Integer> listaParamMock = Arrays.asList(5,5);
        int value = Whitebox.invokeMethod(aritmetica, "sumValues", listaParamMock);
        assertEquals(expectedValue, value);
    }
    
    //Mocking a private method
    @Test
    public void testCloudOpVal3() throws Exception {
        int getServiceValueMock = 3;
        float expectedValue = 6;
        float val1 = 16;
        float val2 = 28;
        int wantedNumberOfInvocations = 1;
        //define el comportamiento y la salida que tendra la interface
        when(cloudService.getValue()).thenReturn(getServiceValueMock);
        PowerMockito.when(aritmetica, "getDefaultNumber").thenReturn(6);
        
        float value = aritmetica.cloudOp(val1, val2);
        assertEquals(expectedValue, value, 0);
        
        verifyPrivate(aritmetica, times(wantedNumberOfInvocations)).invoke("getDefaultNumber");
    }
    
    @Test
    public void testCloudOpVal4() throws Exception {
        int getServiceValueMock = 4;
        float expectedValue = 9;
        float val1 = 16;
        float val2 = 28;
        int wantedNumberOfInvocations = 1;
        List<Integer> listParamMock = Arrays.asList(3,3);
        //define el comportamiento y la salida que tendra la interface
        when(cloudService.getValue()).thenReturn(getServiceValueMock);
        when(cloudService.getValues()).thenReturn(listParamMock);
        
        PowerMockito.doReturn(9).when(aritmetica, "sumValues", any());
        
        float value = aritmetica.cloudOp(val1, val2);
        assertEquals(expectedValue, value, 0);
        
        verifyPrivate(aritmetica, times(wantedNumberOfInvocations)).invoke("sumValues", listParamMock);
    }
    
    @Test
    public void testStaticMethod() throws Exception {
        int paramValue = 4;
        int expectedValue = 16;
        int value = Whitebox.invokeMethod(Aritmetica.class, "staticMethod", paramValue);
        assertEquals(expectedValue, value);
    }
    
    @Test
    public void testSumValuesWithStaticCall() throws Exception {
        int valueMock = 10;
        int expectedValue = 30;
        List<Integer> listaParamMock = Arrays.asList(15,5);
        
        PowerMockito.mockStatic(Aritmetica.class);
        PowerMockito.doReturn(valueMock).when(Aritmetica.class, "staticMethod", anyInt());
        
        int value = Whitebox.invokeMethod(aritmetica, "sumValueWithStaticCall", listaParamMock);
        
        assertEquals(expectedValue, value);
    }
}
