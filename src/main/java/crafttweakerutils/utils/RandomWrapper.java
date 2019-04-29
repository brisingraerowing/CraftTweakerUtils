package crafttweakerutils.utils;

import java.util.Random;

public class RandomWrapper implements IRandom {

	private Random random;

	public RandomWrapper(Random r)
	{
		if(r == null) { throw new NullPointerException("Argument is null!"); }
		random = r;
	}

	@Override
	public boolean nextBoolean() {
		return random.nextBoolean();
	}

	@Override
	public double nextDouble() {
		return random.nextDouble();
	}

	@Override
	public float nextFloat() {
		return random.nextFloat();
	}

	@Override
	public double nextGaussian() {
		return random.nextGaussian();
	}

	@Override
	public int nextInt() {
		return random.nextInt();
	}

	@Override
	public int nextInt(int i) {
		return random.nextInt(i);
	}

	@Override
	public long nextLong() {
		return random.nextLong();
	}
}
