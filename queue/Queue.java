package com.ds;

public class Queue {


		Node front;
		Node rear;


		class Node{
			Node next;
			int data;


			public Node(int data) {
				super();
				this.next = next;
				this.data = data;
			}
		}

		public Node enque(int data)
		{
			 Node newNode = new Node(data);
			 if (front == null && rear==null)
			 {
				front= rear = newNode;
			 }
			 else
			 {
				 Node temp = rear;
				 while (temp.next != null)
				 {
				 temp = rear.next;
				 }
				 temp.next = newNode;
			 }
			 return newNode;
		}

		public void print()
		 {
			 Node temp = front;

			 if(temp==null)
			 {
				 System.out.println("queue is empty");
			 }
			 while (temp != null)
			 {
				 System.out.print(temp.data + " -> ");
				 temp = temp.next;
			 }
			 System.out.println();
		 }

        }
