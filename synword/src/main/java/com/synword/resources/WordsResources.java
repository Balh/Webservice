package synword.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import com.synword.representations.Words;
import com.synword.dao.*;
import org.skife.jdbi.v2.DBI;
import java.lang.String;

    @Path("/contact")
    @Produces(MediaType.APPLICATION_JSON)
    public class WordsResources {

        private final ConnectDAO connectDao;

        public WordsResources(DBI jdbi) {
        connectDao=jdbi.onDemand(ConnectDAO.class);
    }
        @GET
        //@PATH("/{id}")
        public Response getWords() {
            // retrievethe words
            Words words = connectDao.getWords();
            return Response
                    .ok(words)
                    .build();
        }

        @POST
        public Response createContact(Words words) {
            // store the new contact
            // ...
            return Response
                    .created(null)
                    .build();
        }



        @PUT
        @Path("/{id}")
        public Response updateContact(
                @PathParam("id") int id,
                Words words) {

            return Response
                    .ok(null)
                    .build();

        }
    }
