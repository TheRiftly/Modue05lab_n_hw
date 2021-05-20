package com.olympic.cis143.m05.student.lab.trycatch;

import javax.management.BadStringOperationException;

public class ThrowsException {

    public void throwAnExceptionForMe() throws BadStringOperationException, InterruptedException {
        this.thowMultipleExceptionsForMe();
    }

    @SuppressWarnings("finally")
	private void thowMultipleExceptionsForMe() throws BadStringOperationException, InterruptedException {
        /*if ( 1 == 1 ) {
            throw new InterruptedException("Another exception that you will need to take care of.");
        }
        throw new BadStringOperationException("Simple exception that you will need to take care of");*/
    	try {
	    	if(Thread.interrupted()) {
	    		throw new InterruptedException("Threads are busy");
	    	}
	    	throw new BadStringOperationException("String types only");
    	}
    	
    	catch(InterruptedException e) {
    		
    	}
    	
		catch(BadStringOperationException e) {
		    		
		}
    	
    	finally {
    		MyException ex = new MyException();
    		throw new Exception ex;
    		
    	}
    	
    	}
    }
