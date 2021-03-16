
public interface TreeInterface<T> {

    /** Gets the root data. */
    public T getRootData();

    /** Computes the height of the whole tree.
     * @return the height of the whole tree.
     */
    public int getHeight();

    /** Computes the number of nodes in the whole tree.
     * @return the number of nodes in the whole tree.
     */
    public int getNumberOfNodes();

    /** Checks whether the root is empty.
     * @return True if the root is empty, otherwise false.
     */
    public boolean isEmpty();

    /** Sets the root to null, hence the tree becomes empty. */
    public void clear();
}