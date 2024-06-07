package ar.edu.unq.poo2.tp9.ShapeShifter;

import java.util.List;

public interface IShapeShifter{
	public IShapeShifter compose(IShapeShifter shapeShifter);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();
}
