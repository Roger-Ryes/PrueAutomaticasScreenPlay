package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.controls.IGrid;
import com.cobiscorp.cobis.utils.events.ITextReadable;

import net.serenitybdd.screenplay.targets.Target;

public class FDetalleOperacionApertura {

	public static class Buttons {

		public static final BotonOpcionesApertura botonOpcionesApertura = Singleton
				.getInstance(BotonOpcionesApertura.class);
		public static final BotonAceptar botonAceptar = Singleton.getInstance(BotonAceptar.class);
		public static final ComprobanteApertura comprobanteApertura = Singleton.getInstance(ComprobanteApertura.class);
		public static final BotonModificacion botonModificacion = Singleton.getInstance(BotonModificacion.class);
		public static final BotonActivar botonActivar = Singleton.getInstance(BotonActivar.class);
		public static final BotonAnular botonAnular = Singleton.getInstance(BotonAnular.class);
		public static final BotonCerrarMensajeExcepcion botonCerrarMensajeExcepcion  = Singleton.getInstance(BotonCerrarMensajeExcepcion.class);
		public static final BotonEtiquetaTitulares botonEtiquetaTitulares  = Singleton.getInstance(BotonEtiquetaTitulares.class);
		public static final BotonEtiquetaRecepcionFondos botonEtiquetaRecepcionFondos  = Singleton.getInstance(BotonEtiquetaRecepcionFondos.class);

		public static class BotonOpcionesApertura implements IButton {

			private String id = "HVA_VABUTTON_ACTIONS";

			private Target target = Target.the("BotonOpcionesApertura").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class BotonActivar implements IButton {

			private String id = "HVA_ACTIONS_2";

			private Target target = Target.the("BotonActivar").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}

		}
		
		public static class ComprobanteApertura implements IButton {

			private String id = "HVA_ACTIONS_0";

			private Target target = Target.the("ComprobanteApertura").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}

		}
		
		public static class BotonModificacion implements IButton {

			private String id = "HVA_ACTIONS_1";

			private Target target = Target.the("BotonModificacion").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}

		}
		
		public static class BotonAnular implements IButton {

			private String id = "HVA_ACTIONS_3";

			private Target target = Target.the("BotonAnular").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}

		}

		public static class BotonAceptar implements IButton {

			private String id = "CM_TPFPRTTP_0PX";

			private Target target = Target.the("BotonActivar").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}

		}
		
		public static class BotonCerrarMensajeExcepcion implements IButton {

			private String xpath = "/html/body/div[3]/div/div[2]/span";

			private Target target = Target.the("BotonActivar").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}

		}

		public static class BotonEtiquetaTitulares implements IButton {

			private String id = "G_FDETALLECP_908841_tab";

			private Target target = Target.the("BotonEtiquetaTitulares").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}

		}
		
		public static class BotonEtiquetaRecepcionFondos implements IButton {
			
			private String xpath = "//*[@id='G_FDETALLPNR_812841_tab']/span[2]";

			private Target target = Target.the("BotonEtiquetaTitulares").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}

		}
	}

	public static class CabeceraInformacion {
		public static final EstadoApertura estadoApertura = Singleton.getInstance(EstadoApertura.class);
		public static final MontoApertura montoApertura = Singleton.getInstance(MontoApertura.class);
		
		public static class EstadoApertura implements ITextReadable {

			private String id = "HVA_INFOATTRIBUTE_3";
			private Target target = Target.the("EstadoApertura").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class MontoApertura implements ITextReadable {

			private String id = "HVA_INFOATTRIBUTE_0";
			private Target target = Target.the("MontoApertura").located(By.id(id));

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
	
	public static class BarraOpciones{
		public static final PestañaOperacion pestañaOperacion = Singleton.getInstance(PestañaOperacion.class);
		
		public static class PestañaOperacion implements IButton {

			private String xpath = "//*[@id='G_FDETALLEPC_184841_tab']/span[2]";
			private Target target = Target.the("Operacion").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
		
	}
	
	public static class MensajeExcepcion{
		public static final MensajeInformacion mensajeInformacion = Singleton.getInstance(MensajeInformacion.class);
		
		public static class MensajeInformacion implements ITextReadable {

			private String xpath = "/html/body/div[3]/div/div[4]/div";
			private Target target = Target.the("EstadoApertura").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
	}

	public static class GridTitulares implements IGrid{
		private String id = "G_FTITULAEES_465581";
		private Target target = Target.the("GridTitularesNombre").located(By.id(id));
		
		public static final GridTitularesPrimerNombre gridTitularesPrimerNombre = Singleton.getInstance(GridTitularesPrimerNombre.class);
		public static final GridPrimerRecepcionFondos gridPrimerRecepcionFondos = Singleton.getInstance(GridPrimerRecepcionFondos.class);
		
		
		public static class GridTitularesPrimerNombre implements IButton {
					
			private String xpath = "//*[@id='QV_3754_56204']/table/tbody/tr[1]";
			private Target target = Target.the("GridTitularesNombre").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
		public static class GridPrimerRecepcionFondos implements IButton {
			
			private String xpath = "//*[@id='QV_6933_39827']/table/tbody/tr";
			private Target target = Target.the("GridPrimerRecepcionFondos").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
	
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
