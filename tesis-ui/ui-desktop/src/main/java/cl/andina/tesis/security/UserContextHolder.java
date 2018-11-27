package cl.andina.tesis.security;

//import cl.depocargo.rso.dto.GuiaEnPickingDTO;
//import cl.depocargo.rso.entities.Camara;
//import cl.depocargo.rso.entities.Maquina;
//import cl.depocargo.rso.entities.Pesa;
//import cl.depocargo.rso.entities.ResponsablePicking;
//import cl.depocargo.rso.vo.AlmacenVo;
//import cl.depocargo.rso.vo.ParametroVo;
//import cl.depocargo.rso.vo.ZonaAlmacenVo;
//import cl.imagicair.seguridad.dtos.RootMenuDTO;

import java.util.Date;

public interface UserContextHolder
{
    boolean isAuthenticated();

    boolean componenteEsPermitido(String nombreComponente);

    String getNombreUsuario();

    //RootMenuDTO getMenu();

    //AlmacenVo getAlmacenActual();

    //void setAlmacenActual(AlmacenVo almacenActual);
//
    //Pesa getPesaActual();
//
    //void setPesaActual(Pesa pesa);
//
    //Camara getCamaraActual();
//
    //void setCamaraActual(Camara camara);
//
    //String getNombreCompleto();
//
    //ParametroVo getParametro();
//
    //void setParametro(ParametroVo parametro);
//
    //ZonaAlmacenVo getZonaAlmacen();
//
    //void setZonaAlmacen(ZonaAlmacenVo zonaAlmacen);
//
    //ResponsablePicking getResponsablePicking();
//
    //void setResponsablePicking(ResponsablePicking responsablePicking);
//
    //GuiaEnPickingDTO getGuiaEnPicking();
//
    //void setGuiaEnPicking(GuiaEnPickingDTO guiaEnPicking);
//
    //Date getFechaActual();
//
    //Maquina getMaquina();
//
    //void setMaquina(Maquina maquina);
//
    //Boolean getHombrePie();
//
    //void setHombrePie(Boolean hombrePie);
//
    //boolean isCheckListRealizado();
//
    //void setCheckListRealizado(boolean checkListRealizado);
//
    //boolean isMostrarMenu();
}
