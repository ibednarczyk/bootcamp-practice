package library.webservice;

import com.kodilla.courses.soap.library.GetBookRequest;
import com.kodilla.courses.soap.library.GetBookResponse;
import library.book.collection.BookCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BookEndpoint {
    private static final String NAMESPACE_URI= "http://kodilla.com/courses/soap/library";

    private BookCollection bookCollection;

    @Autowired
    public BookEndpoint(BookCollection collection){
        this.bookCollection = collection;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
    @ResponsePayload
    public GetBookResponse getBook(@RequestPayload GetBookRequest request){
        GetBookResponse response = new GetBookResponse();
        response.setSignature(bookCollection.findBook(request.getSignature()));
        return response;
    }
}
