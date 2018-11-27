package cl.andina.tesis.web.controller;


import java.io.Serializable;

public class BlehBean
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
