package w;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import w.models.entities.HuAppUser;

@Path("/Entity")
public class EntityResource {

    @GET
    @Path("/HuAppUser")
    public List<HuAppUser> getUsers() {
        List<HuAppUser> users = HuAppUser.listAll();
        return users;
    }

}