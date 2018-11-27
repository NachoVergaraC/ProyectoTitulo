package cl.andina.tesis.security;

//import cl.depocargo.rso.exceptions.SinAlmacenAsociado;
//import cl.imagicair.seguridad.exceptions.SinCalceUsuarioContrasena;
//import cl.imagicair.seguridad.exceptions.SinCalceUsuarioSistema;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class UserLoginFailureHandler
        implements AuthenticationFailureHandler
{
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest,
                                        HttpServletResponse httpServletResponse,
                                        AuthenticationException e)
            throws IOException, ServletException
    {
        int errorCode = 0;
        if (e instanceof BadCredentialsException)
        {
            //if (e.getCause() instanceof SinCalceUsuarioContrasena)
            //    errorCode = 11;
            //else if (e.getCause() instanceof SinCalceUsuarioSistema)
            //    errorCode = 12;
            //else if (e.getCause() instanceof SinAlmacenAsociado)
            //    errorCode = 13;
        }
        else if (e instanceof SessionAuthenticationException)
        {
            if (e.getMessage().contains("Maximum"))
                errorCode = 32;
            else
                errorCode = 31;
        }

        httpServletResponse.sendRedirect(
                httpServletRequest.getContextPath() + "/app/login?login_error=" + errorCode
                                        );
    }
}
