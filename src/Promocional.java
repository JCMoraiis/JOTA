@FunctionalInterface
public interface Promocional {
	
	public abstract boolean aplicarDesconto(double valorDesconto);
	
	default boolean aplicaDescontoDe10Porcento() {
		return aplicarDesconto(0.1);
	}
}
