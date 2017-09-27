package huanjushidai;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class test02 {
      public class BlockingQueueimpl<E> implements BlockingQueue<E>{
    	   private final int Max_length = 100;
    	   private Vector<E> vector = new Vector<E>(Max_length);
    	   private ReentrantLock lock = new ReentrantLock(true);
    	   private Condition notFull=  lock.newCondition();
    	   private Condition notEmpty = lock.newCondition();
		@Override
		public E remove() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public E poll() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public E element() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public E peek() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public Iterator<E> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public <T> T[] toArray(T[] a) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public boolean containsAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean addAll(Collection<? extends E> c) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean removeAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean retainAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public boolean add(E e) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean offer(E e) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public void put(E e) throws InterruptedException {
			// TODO Auto-generated method stub
			lock.lockInterruptibly();
			int size = vector.size();
			try {
				if(size==Max_length) 
					notFull.await();//��������״̬
				else {
					vector.addElement(e);
					notEmpty.signal();
				}
			}finally {
				lock.unlock();
			}
			
		}
		@Override
		public boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public E take() throws InterruptedException {
			// TODO Auto-generated method stub
			lock.lockInterruptibly();
			E e = null;
			try {
				if(vector.size()==0)
					notEmpty.await();
				else {
					e = vector.get(vector.size()-1);
					notFull.signal();
					return e;
				}return e;
			}finally {
				lock.unlock();
			}
			
		}
		@Override
		public E poll(long timeout, TimeUnit unit) throws InterruptedException {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public int remainingCapacity() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public int drainTo(Collection<? super E> c) {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public int drainTo(Collection<? super E> c, int maxElements) {
			// TODO Auto-generated method stub
			return 0;
		}
      }
}
