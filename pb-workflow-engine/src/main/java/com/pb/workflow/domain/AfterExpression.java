/**
 * 
 */
package com.pb.workflow.domain;

/**
 * @author Tarush Grover
 *
 */
public class AfterExpression extends QueryExpression{
	
	private final QueryExpression left;
	private final QueryExpression right;

	public AfterExpression(QueryExpression left, QueryExpression right) {
		super("after");
		this.left = left;
		this.right = right;
	}

	/**
	 * @return the leftOperand
	 */
	public QueryExpression getLeft() {
		return left;
	}

	/**
	 * @return the rightOperand
	 */
	public QueryExpression getRight() {
		return right;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AfterExpression other = (AfterExpression) o;

        if (left != null ? !left.equals(other.left) : other.left != null) return false;
        if (right != null ? !right.equals(other.right) : other.right != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int hashcode = left != null ? left.hashCode() : 0;
        hashcode = 31 * hashcode + (right != null ? right.hashCode() : 0);
        return hashcode;
    }
}
