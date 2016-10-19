package com.learn.algo.string;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

	public List<String> getpermutationsOf(String input) {
		char[] ica = input.toCharArray();
		List<String> permutes = new ArrayList<String>();
		permute(ica,0,ica.length-1,permutes);
		return permutes;
	}

	private void permute(char[] ica, int startPostion,int endPosition,List<String>permutes) {
		if(startPostion ==endPosition ){
			permutes.add(new String(ica));
		}else{
			for (int i = startPostion; i <= endPosition; i++) {
				  char tp = ica[startPostion] ;
				  ica[startPostion] =ica[i];
				  ica[i]=tp;
	              permute(ica,startPostion+1,endPosition,permutes);
			}
		}
		
	}
	
}
