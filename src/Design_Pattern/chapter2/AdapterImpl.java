package Design_Pattern.chapter2;

public class AdapterImpl implements Adapter{

//	@Override
//	public Float twotime(Float f) {
//		return (float)Math.twoTime(f.doubleValue());
//	}
	@Override
	public Float twotime(Float f) {
		return Math.doubled(f.doubleValue()).floatValue();
	}

//	@Override
//	public Float half(Float f) {
//		return (float)Math.half(f.doubleValue());
//	}
	@Override
	public Float half(Float f) {
		return Math.halfed(f.doubleValue()).floatValue();
	}



}
