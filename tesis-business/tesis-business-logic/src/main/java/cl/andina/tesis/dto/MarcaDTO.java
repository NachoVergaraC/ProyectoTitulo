package cl.andina.tesis.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class MarcaDTO
        extends DomainDTO
{
    private String rut;

    private String nombre;

    private String giro;

    private boolean personaNatural;

    private boolean inicioActividades;

    private String correo;

    public String getRut()
    {
        return rut;
    }

    public void setRut(String rut)
    {
        this.rut = rut;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getGiro()
    {
        return giro;
    }

    public void setGiro(String giro)
    {
        this.giro = giro;
    }

    public boolean isPersonaNatural()
    {
        return personaNatural;
    }

    public void setPersonaNatural(boolean personaNatural)
    {
        this.personaNatural = personaNatural;
    }

    public boolean isInicioActividades()
    {
        return inicioActividades;
    }

    public void setInicioActividades(boolean inicioActividades)
    {
        this.inicioActividades = inicioActividades;
    }

    public String getCorreo()
    {
        return correo;
    }

    public void setCorreo(String correo)
    {
        this.correo = correo;
    }
}
