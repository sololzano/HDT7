/**
 * 
 */

/**
 * @author carlos
 *
 */
public class BinarySearchTree<E extends Comparable<E>, V> {

	private Node<E, V> root;
	/**
	 * 
	 */
	public BinarySearchTree() {
		root = null;
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public boolean lookup(E key) {
		return lookup(root, key);
	}
	
	/**
	 * 
	 * @param n
	 * @param key
	 * @return
	 */
	private boolean lookup(Node<E, V> n, E key) {
		if (n == null) {
			return false;
		} if (n.getKey().equals(key)) {
			return true;
		} if (key.compareTo(n.getKey()) < 0) {
			return lookup(n.getLeft(), key);
		} else {
			return lookup(n.getRight(), key);
		}
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public void insert (E key, V value) throws Exception {
		root = insert(root, key, value);
	}
	
	/**
	 * 
	 * @param n
	 * @param key
	 * @return
	 * @throws DuplicateException
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
}
