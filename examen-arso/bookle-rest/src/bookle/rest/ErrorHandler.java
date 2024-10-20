package bookle.rest;

import javax.ws.rs.core.Response;

import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import bookle.controlador.BookleException;


@Provider
public class ErrorHandler implements ExceptionMapper<BookleException> {

	@Override
	public Response toResponse(BookleException arg0) {
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		
	}

}
