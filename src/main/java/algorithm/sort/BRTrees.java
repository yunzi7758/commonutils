package com.sunrise.code.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;



public class BRTrees {

	public static void main(String[] args) {
		int[] intarray =  {3,2,1,4,5,6,7,10,9,8,0};
		int[] indexarray = {2,7,1,3,5,4,3,5,6,4,7};
		TNode bTree = null;
		BRTrees trees = new BRTrees();
		for (int i = 0; i < intarray.length; i++) {
			bTree = trees.add(intarray[i],bTree);
			trees.print(bTree);
		}
		
		System.out.println("aa");
	}
	
	private  void print(TNode root) {
		if (root==null)
		{
			System.out.println("nothing");
		}
		Map<Integer, List<TNode>> lineMap = new HashMap<Integer, List<TNode>>();
		int high = 1;
		for (; ; high++)
		{
			List<TNode> tnList= new ArrayList<TNode>();
			int nullcount = 0;
			if (high==1)
			{
				tnList.add(root);
			}else {
				List<TNode> list = lineMap.get(high-1);
				for (TNode tNode : list)
				{
					if (tNode.getlNode()!=null)
					{
						tnList.add(tNode.getlNode());
					}else {
						tnList.add(new TNode(true));
						nullcount++;
					}
					if (tNode.getrNode()!=null)
					{
						tnList.add(tNode.getrNode());
					}else {
						tnList.add(new TNode(true));
						nullcount++;
					}
				}
			}
			if (tnList.size()>nullcount)
			{
				lineMap.put(high, tnList);
			}else {
				break;
			}
		}
		Set<Entry<Integer,List<TNode>>> entrySet = lineMap.entrySet();
		for (Entry<Integer, List<TNode>> entry : entrySet)
		{
			Integer key = entry.getKey();
			List<TNode> value = entry.getValue();
			StringBuilder sb = new StringBuilder();
			int c =1<<high-key;
			
			for (int i = 0; i < c; i++)
			{
				sb.append(" ");
			}
			if (value.size()==1)
			{
				sb.append(value.get(0).getColor()+":"+value.get(0).getK());
			}else if (value.size()>1) {
				
				
				for (TNode tNode : value)
				{
					
					if (tNode.isNULLFALG())
					{
						sb.append("  ");
					}else {
						sb.append(tNode.getColor()+":"+tNode.getK());
					}
					
					for (int i = 0; i < c; i++)
					{
						sb.append(" ");
					}
				}
			}
			System.out.println(sb);
		}
		System.out.println("**************************END**************************");
	}

	public TNode add(int k, TNode root) {
		if (null==root) {
			return new TNode(k,false);
		}else {
			return addk(k, root);
		}
	}
	
	public TNode addk(int k, TNode root) {
//		TNode addtofinal = addtofinal(k, root);
//		rebalence(addtofinal,root);
		return rebalence(addtofinal(k, root),root);
	}
	private TNode getRoot(TNode addtofinal) {
		while (addtofinal.getParent()!=null) {
			addtofinal = addtofinal.getParent();
		}
		return addtofinal;
	}

	public TNode addtofinal(int k, TNode root) {
		
		int rk = root.getK();
		TNode tmp = root,ret = null;
		do {
			if (rk > k) {
				if (tmp.getlNode() != null) {
					tmp = tmp.getlNode();
				}else if (tmp.getlNode() == null) {
					ret = new TNode(k);
					tmp.setlNode(ret);
					ret.setParent(tmp);
					break;
				}
			} else if (rk < k) {
				if (tmp.getrNode() != null) {
					tmp = tmp.getrNode();
				}else if (tmp.getrNode() == null) {
					ret = new TNode(k);
					tmp.setrNode(ret);
					ret.setParent(tmp);
					break;
				}
			} else if (rk == k) {
				break;
			}
			rk = tmp.getK();
		} while (tmp != null); 
		
		return ret;
	}
	
	private TNode rebalence(TNode curnode, TNode root) {
		TNode parent,gparent,uncle;
		
		do {
			parent = curnode.getParent();
			
			if (parent == null) {
				curnode.setRed(false);
				root = curnode;
				return root;
			}
			gparent = parent.getParent();
			if (gparent == null) {
				parent.setRed(false);
				root = parent;
				return root;
			}
			
			if (parent==gparent.getlNode()) {
				uncle = gparent.getrNode();
				if (uncle!=null&&uncle.isRed()) {
					uncle.setRed(false);
					parent.setRed(false);
					gparent.setRed(true);
					curnode = gparent;//rebalence&goup togparent
				}else {
					if (curnode==parent.getrNode()) {
						leftSpilt(curnode);
						parent = curnode;
					}
					rightSpilt(parent);
					
					parent.setRed(false);
					gparent.setRed(true);
					root = getRoot(parent);
					curnode = parent;
				}
			} else {
				uncle = gparent.getlNode();
				if (uncle!=null&&uncle.isRed()) {
					uncle.setRed(false);
					parent.setRed(false);
					gparent.setRed(true);
					curnode = gparent;//rebalence&goup togparent
				}else {
					if (curnode==parent.getlNode()) {
						rightSpilt(curnode);
						parent = curnode;
					}
					leftSpilt(parent);
					
					parent.setRed(false);
					gparent.setRed(true);
					root = getRoot(parent);
					curnode = parent;
				}
			}
		}while (curnode.isRed());
		return root;
	}



	private void rightSpilt(TNode curnode) {
		TNode parent = curnode.getParent();
		TNode gparent = parent.getParent();
		TNode rNode = curnode.getrNode();
		
		curnode.setParent(gparent);
		if (gparent!=null)
		{
			if (gparent.getrNode()==parent)
			{
				gparent.setrNode(curnode);
			}else {
				gparent.setlNode(curnode);
			}
		}
		
		
		curnode.setrNode(parent);
		parent.setParent(curnode);
		
		parent.setlNode(rNode);
		if (rNode!=null) {
			rNode.setParent(parent);
		}
		
	}


	private void leftSpilt(TNode curnode) {
		TNode parent = curnode.getParent();
		TNode gparent = parent.getParent();
		TNode lNode = curnode.getlNode();
		
		curnode.setParent(gparent);
		if (gparent!=null)
		{
			if (gparent.getrNode()==parent)
			{
				gparent.setrNode(curnode);
			}else {
				gparent.setlNode(curnode);
			}
		}
		
		
		curnode.setlNode(parent);
		parent.setParent(curnode);
		
		parent.setrNode(lNode);
		if (lNode!=null) {
			lNode.setParent(parent);
		}
		
	}



	class TNode{
		private int k;
		private TNode parent,lNode,rNode;
		private boolean red = true;
		private boolean NULLFALG = false;
		
		
		public TNode(boolean nULLFALG)
		{
			super();
			NULLFALG = nULLFALG;
		}
		public TNode(int k) {
			super();
			this.k = k;
		}
		public TNode(int k, boolean red) {
			super();
			this.k = k;
			this.red = red;
		}
		public int getK() {
			return k;
		}
		public void setK(int k) {
			this.k = k;
		}
		public TNode getParent() {
			return parent;
		}
		public void setParent(TNode parent) {
			this.parent = parent;
		}
		public TNode getlNode() {
			return lNode;
		}
		public void setlNode(TNode lNode) {
			this.lNode = lNode;
		}
		public TNode getrNode() {
			return rNode;
		}
		public void setrNode(TNode rNode) {
			this.rNode = rNode;
		}
		public boolean isRed() {
			return red;
		}
		public String getColor() {
			String ret = "B";
			if (isRed())
			{
				ret = "R";
			}
			return ret;
		}
		
		public boolean isNULLFALG()
		{
			return NULLFALG;
		}
		public void setNULLFALG(boolean nULLFALG)
		{
			NULLFALG = nULLFALG;
		}
		public void setRed(boolean red) {
			this.red = red;
		}
	}
}
