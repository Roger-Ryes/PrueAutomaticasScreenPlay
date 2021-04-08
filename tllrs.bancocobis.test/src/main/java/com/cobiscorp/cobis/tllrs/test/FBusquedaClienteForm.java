package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.tllrs.test.AdminAperturaPlazoFijo.Buttons.BotonNuevo;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IInputValue;

import net.serenitybdd.screenplay.targets.Target;

public class FBusquedaClienteForm {

	public static class FiltroBusquedaCliente {
		public static final INPUT_IDENTIFICACION input_IDENTIFICACION = Singleton.getInstance(INPUT_IDENTIFICACION.class);
		
		public static class INPUT_IDENTIFICACION implements IInputValue {

			private String id = "VA_DOCIDIXRMVJUDPW_205587";
			private Target target = Target.the("Identificacion").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
	}

	public static class Buttons{
		
		public static final BotonBuscarCliente botonBuscarCliente = Singleton.getInstance(BotonBuscarCliente.class);
		public static class BotonBuscarCliente implements IButton{
	
			private String rutaXPath = "//*[@id='VA_VAIMAGEBUTTONNN_801587']";
			private Target target = Target.the("BotonBuscarCliente").located(By.xpath(rutaXPath));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return rutaXPath;
			}
	
		}
	}
}