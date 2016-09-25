/**
 * @author Rodolfo Cacacho, Freddy España, Carlos Solórzano
 * @since 25 - 09 -2016
 *
 */
public class BinarySearchTree<E extends Comparable<E>, V> {

	private Node<E, V> root;
	
	/**
	 * Constructor vacío 
	 */
	public BinarySearchTree() {
		root = null;
	}
	
	/**
	 * Wrapper
	 * @param key
	 * @return El valor de la clave buscada
	 */
	public V lookup(E key) {
		return lookup(root, key);
	}
	
	/**
	 * 
	 * @param n El árbol o subárbol en el que se realizará la búsqueda
	 * @param key La clave a buscar
	 * @return El valor de la clave buscada
	 */
	private V lookup(Node<E, V> n, E key) {
		if (n == null) {
			return null;
		} if (n.getKey().equals(key)) {
			return n.getValue();
		} if (key.compareTo(n.getKey()) < 0) {
			return lookup(n.getLeft(), key);
		} else {
			return lookup(n.getRight(), key);
		}
	}
	
	/**
	 * 
	 * @param key La nueva clave
	 * @param value El valor de la nueva clave
	 * @throws Exception Se produce al encontrar claves iguales
	 */
	public void insert (E key, V value) throws Exception {
		root = insert(root, key, value);
	}
	
	/**
	 * 
	 * @param n El nodo a inspeccionar para añadir clave
	 * @param key La clave a agregar
	 * @param value El valor de la nueva clave
	 * @return El nuevo subárbol formado
	 * @throws Exception Se produce al encontrar claves iguales
	 */
	private Node<E, V> insert(Node<E, V> n, E key, V value) throws Exception {
		if (n == null) {
			root = new Node<E, V> (key, value, null, null);
			return new Node<E, V> (key, value, null, null);
		} if (n.getKey().equals(key)) {
			throw new Exception();
		} if (key.compareTo(n.getKey()) < 0) {
			n.setLeft(insert(n.getLeft(), key, value));
			return n;
		} else {
			n.setRight(insert(n.getRight(), key, value));
			return n;
		}
	}
	
	/**
	 * Wrapper
	 */
	public void inOrder() {
		inOrder(root);
	}
	
	/**
	 * Método recursivo
	 * @param node El nodo en el que se realizará la búsqueda
	 */
	private void inOrder(Node<E, V> node) {
		if (node == null) {
			return;
		}
		inOrder(node.getLeft());
		System.out.println(node.getKey() + ": " + node.getValue());
		inOrder(node.getRight());
	}
}
