
package clientews.servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientews.servicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarPersona_QNAME = new QName("http://servicio.sga.gm.com.mx/", "listarPersona");
    private final static QName _ListarPersonaResponse_QNAME = new QName("http://servicio.sga.gm.com.mx/", "listarPersonaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientews.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarPersona }
     * 
     */
    public ListarPersona createListarPersona() {
        return new ListarPersona();
    }

    /**
     * Create an instance of {@link ListarPersonaResponse }
     * 
     */
    public ListarPersonaResponse createListarPersonaResponse() {
        return new ListarPersonaResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPersona }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPersona }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "listarPersona")
    public JAXBElement<ListarPersona> createListarPersona(ListarPersona value) {
        return new JAXBElement<ListarPersona>(_ListarPersona_QNAME, ListarPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPersonaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPersonaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio.sga.gm.com.mx/", name = "listarPersonaResponse")
    public JAXBElement<ListarPersonaResponse> createListarPersonaResponse(ListarPersonaResponse value) {
        return new JAXBElement<ListarPersonaResponse>(_ListarPersonaResponse_QNAME, ListarPersonaResponse.class, null, value);
    }

}
