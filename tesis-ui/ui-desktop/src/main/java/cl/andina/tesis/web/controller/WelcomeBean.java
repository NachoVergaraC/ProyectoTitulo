package cl.andina.tesis.web.controller;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ViewScoped
@ManagedBean(name = "welcomeBean")
public class WelcomeBean
        implements Serializable
{
    public String pepito;

    public void init()
    {
        pepito = "Aca completo el contexto";
    }

    public String getPepito()
    {
        return pepito;
    }

    public void setPepito(String pepito)
    {
        this.pepito = pepito;
    }
}
