package thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class FileOperations implements Runnable {

	static FileOperations fOp = new FileOperations();

	Integer maxNumber = 2*1000*1000;

	static Integer size = 10;

	Integer counter = 1;
	
	String threadNameFlag = "";
	
	@Override
	public void run() {
		threadNameFlag = "thread_";
		fileProducer(counter++);
	}

	public String generateAbsoluteFilePath(Integer fileId) {

		// D:\workspace\thread
		String projectPath = System.getProperty("user.dir");
		
		String fileName = threadNameFlag + "file_" + fileId.toString() + ".txt";

		String absoluteFilePath = projectPath + "/testFiles/" + fileName;

		return absoluteFilePath;

	}

	public boolean fileExist(String absoluteFilePath) {

		boolean result = false;

		// creates a file object not a real file.
		File f = new File(absoluteFilePath);

		if (f.exists() && f.isFile()) {
			result = true;
		}

		return result;

	}

	public boolean createFile(String absoluteFilePath) {

		boolean result = false;

		File file = new File(absoluteFilePath);

		try {
			file.createNewFile();
			result = true;
		} catch (IOException e) {
			result = false;
			e.printStackTrace();
		}

		return result;

	}

	public boolean deleteFile(String absoluteFilePath) {

		boolean result = false;

		File file = new File(absoluteFilePath);

		result = file.delete();

		return result;

	}

	public boolean fillFile(File f) {

		boolean result = false;

		PrintWriter writer;
		try {

			writer = new PrintWriter(f, "UTF-8");

			for (int i = 1; i <= maxNumber; i++) {

				writer.println(i);

			}

			writer.close();

			result = true;

		} catch (FileNotFoundException e) {
			result = false;
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			result = false;
			e.printStackTrace();
		}

		return result;

	}

	public static void fileProducer(Integer fileId) {

		// FileOperations fOp = new FileOperations();

		String absoluteFilePath = fOp.generateAbsoluteFilePath(fileId);

		boolean fileExist = fOp.fileExist(absoluteFilePath);

		boolean isFileCreated = false, isFileDeleted = false;

		if (fileExist == false) {
			isFileCreated = fOp.createFile(absoluteFilePath);
		} else if (fileExist == true) {
			isFileDeleted = fOp.deleteFile(absoluteFilePath);
		}

		if (isFileCreated == true) {
			fOp.fillFile(new File(absoluteFilePath));
		} else if (isFileDeleted == true) {
			// System.out.println("deleted file: " + absoluteFilePath);
			fOp.createFile(absoluteFilePath);
			fOp.fillFile(new File(absoluteFilePath));
		}

	}

	private static Duration manualRun() {

		Instant first = Instant.now();

		for (int i = 1; i <= size; i++) {
			fileProducer(i);
		}

		Instant second = Instant.now();

		Duration duration = Duration.between(first, second);

		return duration;

	}

	private static Duration concurrentRun() {

		Instant first = Instant.now();
				
		Thread[] t = new Thread[size];
		
		//start each thread (start means fork or run a process (pid) at task manager)
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(fOp);
			t[i].start();
		}
		
		//wait for each thread to die (join means thread die or end-of thread)
		for (int i = 0; i < t.length; i++) {
			try {
				t[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Instant second = Instant.now();

		Duration duration = Duration.between(first, second);

		return duration;
	}

	public static void main(String[] args) {
		
//		Duration manualDuration = manualRun();
//		System.out.println("Manual Run Duration-(miliSecond): " + manualDuration.toMillis());
		
		Duration threadDuration = concurrentRun();
		System.out.println("Concurrent Run Duration-(miliSecond): " + threadDuration.toMillis());
		
//		long durationDifference = manualDuration.toMillis() - threadDuration.toMillis();
//		System.out.println("Time Difference-(miliSecond): " + TimeUnit.MILLISECONDS.toMillis(durationDifference) );
		
	}

}
