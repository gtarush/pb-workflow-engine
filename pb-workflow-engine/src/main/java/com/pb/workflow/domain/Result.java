/**
 * 
 */
package com.pb.workflow.domain;

/**
 * @author Tarush Grover
 *
 */
public class Result implements IQuerySet{
	
	private String result;

	public Result(String result2) {
		this.result = result2;
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Result other = (Result) o;

        if (result != null ? !result.equals(other.result) : other.result != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return result != null ? result.hashCode() : 0;
    }
	

}
