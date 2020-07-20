[Problem Statement] - Scope (https://www.hackerrank.com/challenges/30-scope/problem)

class Difference {
  	private int[] elements;
  	public int maximumDifference;
    
    // Add your code here
    private int max;
    public Difference (int[] a){
        this.elements=a;
    }
    public void computeDifference()
    {
        for(int i =0; i<elements.length; i++)
        {
            for(int j=0; j<elements.length; j++)
            {
                max = Math.abs(elements[i]-elements[j]);
                if(max > maximumDifference)
                {
                    maximumDifference = max;
                }
            }
        }
    }
	
}
