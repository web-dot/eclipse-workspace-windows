package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class TestStream01 {

	public static void main(String[] args) {
		
		
		//anonymoys class
		//constructor defines a new class, without a name and creates object of that class
		TestStream01 ts = new TestStream01 () {
			
			
		};
		
		

		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		//Internal Iterations
		
		//functional interface -> SAM Interfaces(Single Abstract Method Interface)
		
		//values.forEach(i -> System.out.println(i));
		
		//---------------------------------------------------------
		
		//Consumer interface
		
//		Consumer<Integer> c = new Consumer<Integer>() {
//			
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		};
		
//		Consumer<Integer> c = new Consumer<Integer>() {
//			
//			@Override
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		};
		
		//Consumer<Integer> c = (Integer i) -> System.out.println(i);
		//Consumer<Integer> c = i -> System.out.println(i);
		
		//values.forEach(c);

		//values.forEach(i -> System.out.println(i));					//->							
		
		
		//Consumer<Integer> c = i -> System.out.println(i);
		
		//values.forEach(i -> System.out.println(i));
		
		//method reference
		//values.forEach(System.out::println);
		
		
//		values.forEach( new Consumer<Integer>(){
//			
//			@Override
//			public void accept(Integer i) {
//				
//				System.out.println(i);							//->
//			}
//		});
//		
		
		//values.forEach(i->doubleit(i));
		//values.forEach(TestStream01::doubleit);
		
		
		
		
		//values.forEach(c);
		
		
		
		//-------------------------stream-----------------------------
		
		//Stream s = values.stream();
		//s.forEach(System.out::println);
		//s.forEach(System.out::println);  //IllegalStateException
		
		//same as
		//values.stream().forEach(System.out::println);
		
		
		//System.out.println(values.stream().map(i->i*2));
		
		
		
		//----------------------map------------------------
		
		Stream<Integer> s = values.stream();
		
		//map takes object of Function interface
		
		Function<Integer, Integer> f = new Function<Integer, Integer>(){
			
			@Override
			public Integer apply(Integer i) {
				
				return i*2;
			}
		};
		
		Stream<Integer> s1 = s.map(f);
		//s1.forEach(System.out::println);
		
		
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer i, Integer j) {
				return i+j;
			}
		};
		
		Integer result = (Integer)s1.reduce(0, b);
		System.out.println(result);
		
		
		//the above snippet is equivalent to
		
		Stream<Integer> st = values.stream();
		Stream<Integer> st1 = st.map(new Function<Integer, Integer>(){
			
			public Integer apply(Integer i) {
				return i*2;
			}
		});
		
		Integer result2 = (Integer)st1.reduce(0, new BinaryOperator<Integer>() {
			
			public Integer apply(Integer i, Integer j) {
				return i+j;
			}
		});
		
		System.out.println(result);
		
		
		//the above snippet is equivalent to
		
		Stream<Integer> ste = values.stream();
		Stream<Integer> ste1 = ste.map(i->i*2);
		Integer result3 = (Integer)ste1.reduce(0, (c,e)->c+e);
		System.out.println(result3);
		
		
		
		
		
		
	}
	
	
	public static void doubleit(int i) {
		
		System.out.println(i*2);
	}

}













 