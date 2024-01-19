package ejemploInterfaces;

public interface IDepredador {
	
	public abstract void localizar(Animal presa); //puedes poner public abstract pero ya lo son por defecto
	
	void cazar(Animal presa);
	
	
}
