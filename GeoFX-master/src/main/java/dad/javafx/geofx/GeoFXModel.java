package dad.javafx.geofx;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class GeoFXModel {

	public StringProperty latitud=new SimpleStringProperty();
	public StringProperty longitud=new SimpleStringProperty();
	public StringProperty ciudad=new SimpleStringProperty();
	public StringProperty codigoZip=new SimpleStringProperty();
	public StringProperty idioma=new SimpleStringProperty();
	public StringProperty zonaHoraria=new SimpleStringProperty();
	public StringProperty codigoLlamada=new SimpleStringProperty();
	public StringProperty moneda=new SimpleStringProperty();
	
	
	public final StringProperty latitudProperty() {
		return this.latitud;
	}
	
	public final String getLatitud() {
		return this.latitudProperty().get();
	}
	
	public final void setLatitud(final String latitud) {
		this.latitudProperty().set(latitud);
	}
	
	public final StringProperty longitudProperty() {
		return this.longitud;
	}
	
	public final String getLongitud() {
		return this.longitudProperty().get();
	}
	
	public final void setLongitud(final String longitud) {
		this.longitudProperty().set(longitud);
	}
	
	public final StringProperty ciudadProperty() {
		return this.ciudad;
	}
	
	public final String getCiudad() {
		return this.ciudadProperty().get();
	}
	
	public final void setCiudad(final String ciudad) {
		this.ciudadProperty().set(ciudad);
	}
	
	public final StringProperty codigoZipProperty() {
		return this.codigoZip;
	}
	
	public final String getCodigoZip() {
		return this.codigoZipProperty().get();
	}
	
	public final void setCodigoZip(final String codigoZip) {
		this.codigoZipProperty().set(codigoZip);
	}
	
	public final StringProperty idiomaProperty() {
		return this.idioma;
	}
	
	public final String getIdioma() {
		return this.idiomaProperty().get();
	}
	
	public final void setIdioma(final String Idioma) {
		this.idiomaProperty().set(Idioma);
	}
	
	public final StringProperty zonaHorariaProperty() {
		return this.zonaHoraria;
	}
	
	public final String getZonaHoraria() {
		return this.zonaHorariaProperty().get();
	}
	
	public final void setZonaHoraria(final String zonaHoraria) {
		this.zonaHorariaProperty().set(zonaHoraria);
	}
	
	public final StringProperty codigoLlamadaProperty() {
		return this.codigoLlamada;
	}
	
	public final String getCodigoLlamada() {
		return this.codigoLlamadaProperty().get();
	}
	
	public final void setCodigoLlamada(final String codigoLlamada) {
		this.codigoLlamadaProperty().set(codigoLlamada);
	}
	
	public final StringProperty monedaProperty() {
		return this.moneda;
	}
	
	public final String getMoneda() {
		return this.monedaProperty().get();
	}
	
	public final void setMoneda(final String moneda) {
		this.monedaProperty().set(moneda);
	}
	
	
}
