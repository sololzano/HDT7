/**
 * @author Rodolfo Cacacho, Fredy Espana, Carlos Solorzano
 * @since 25 - 09 - 2016
 * http://pages.cs.wisc.edu/~deppeler/cs367-common/readings/Binary-Search-Trees/index.html#imp
 */
public class Node<E, K> {

	private E key;
	private K value;
	private Node<E, K> left;
	private Node<E, K> right;
	
	/**
	 * 
	 * @param data
	 * @param left
	 * @param right
	 */
	public Node(E key, K value, Node<E, K> left, Node<E, K> right) {
		this.setKey(key);
		this.setValue(value);
		this.setLeft(left);
		this.setRight(right);
	}

	/**
	 * @return the key
	 */
	public E getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(E key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public K getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(K value) {
		this.value = value;
	}

	/**
	 * @return the left
	 */
	public Node<E, K> getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(Node<E, K> left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public Node<E, K> getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(Node<E, K> right) {
		this.right = right;
	}
}
