package cl.andina.tesis.dto;

import java.io.Serializable;

public class DomainDTO
        implements Serializable
{
    protected Long id;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DomainDTO domainDTO = (DomainDTO) o;

        if (id != null
            ? !id.equals(domainDTO.id)
            : domainDTO.id != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        return id != null
               ? id.hashCode()
               : 0;
    }
}
