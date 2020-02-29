package Hash;

import java.util.*;

public class raw <k,v>{
	
	public void main(String[] args) {
	LinkedList<HNode<k,v>> list1 = new LinkedList<HNode<k,v>>();
	
	list1.add((HNode<k, v>) new HNode<String,Integer>("asc",1234));
	list1.add((HNode<k, v>) new HNode<String,Integer>("attt",14));
	list1.add((HNode<k, v>) new HNode<String,Integer>("scaa",124));
	list1.add((HNode<k, v>) new HNode<String,Integer>("jets",1));
	list1.add((HNode<k, v>) new HNode<String,Integer>("pt",1444));
	list1.add((HNode<k, v>) new HNode<String,Integer>("saa",1124));
	list1.add((HNode<k, v>) new HNode<String,Integer>("cat",34));
	list1.add((HNode<k, v>) new HNode<String,Integer>("t",114));
	list1.add((HNode<k, v>) new HNode<String,Integer>("abc",124));
	
	System.out.println("run");
	}

}