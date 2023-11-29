package lab_8;

public interface ISearchAlgo {
	public void execute(Node node);
	public Node bestNextNode(Node node, boolean isMax);
}