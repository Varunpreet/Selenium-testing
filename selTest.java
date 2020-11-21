
import org.junit.Assert;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;  
  
public class selTest { 
	
    public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver", "C:/Users/varun/OneDrive/Desktop/chromedriver.exe");  
         
         // Instantiate a ChromeDriver class.     
    WebDriver driver=new ChromeDriver();  
      
       // Launch Website  
    driver.navigate().to("https://www.thesparksfoundationsingapore.org/");  
      
     //Maximize the browser  
      driver.manage().window().maximize();  
      try {
   			Thread.sleep(5000);
   		} catch (InterruptedException e) {
   		}
    JavascriptExecutor js = (JavascriptExecutor)driver;  
//    js.executeScript("scrollBy(0, 500)");   
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement messageElement = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/h2"))
             );

     // Checking if the title of the page is corrrect
    String message = messageElement.getText();
     String successMsg = "The Sparks Foundation";
    Assert.assertEquals (message, successMsg);
    String expectedTitle = "The Sparks Foundation | Home";
    
    // fetch the title of the web page and save it into a string variable
    String actualTitle = driver.getTitle();

    // compare the expected title of the page with the actual title of the page and print the result
    if (expectedTitle.equals(actualTitle))
    {
    	System.out.println("Title of the is verified");
    	driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div/section/div/ol/li[1]/a")).click();
    	 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
    	driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div/section/div/ol/li[2]/a")).click();
    	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
    	driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div/section/div/ol/li[3]/a")).click();
    	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
    	driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div/section/div/ol/li[4]/a")).click();
    	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
    	driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div/section/div/ol/li[5]/a")).click();
    	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
    	driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div/section/div/ol/li[6]/a")).click();
    	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
    }
    else
    {
           System.out.println("Incorrect title is displayed on the web page.");
    }

    driver.findElement(By.linkText("About Us")).click();   
    try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
	} 
    driver.findElement(By.className("dropdown-menu"));
    try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
	}
    driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/ul/li[5]/a")).click(); 
    
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
	}
    
//    Checking if the image is present on the web page or not
    WebElement ImageFile = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[1]/a/img"));
    Boolean ImagePresent = (Boolean) js.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
   
    if (!ImagePresent)
    {
         System.out.println("Image not displayed.");
    }
    else
    {
    	System.out.println("Image is present on the web page");
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[2]/a")).click();
    }
    
//    Verifying the title of the new web page
    try{
    	String expectedTitle2 = "Xaltius - Enabling Data Driven Business Transformation";

    String actualTitle2 = driver.getTitle();
    // compare the expected title of the page with the actual title of the page and print the result
    if (expectedTitle2.equals(actualTitle2))
    {
    	System.out.println("Title of the page is verified");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
    	driver.navigate().back();
    }
    }
    catch(Exception e) {
    	System.out.println("Title of the page not verified");
    }

    driver.navigate().back();
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
	}
    
//    Verifying if the embedded youtube video is present on the web page or not
    try{ 
    	if (driver.findElements(By.xpath("/html/body/div[2]/div/div[1]")).size() != 0 )
    {
    		System.out.println("Embedded video is present on the web page");
 	   driver.findElement(By.xpath("/html/body/div[2]/div/div[1]")).click();
 	  try {
  		Thread.sleep(4000);
  	} catch (InterruptedException e) {
  	}
  }
    }
  catch (Exception e) {
   System.out.println("Video is not present on webpage");
  }
    
    driver.findElement(By.linkText("Join Us")).click();   
    
		driver.findElement(By.className("dropdown-menu"));
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
		}
        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[5]/ul/li[1]/a")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
        
//        Checking the presence of text fields on the web page
        try{WebElement name =driver.findElement(By.name("Name"));
        name.sendKeys("abc");
        System.out.println("Name Textfield is present on the web page");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
        WebElement email =driver.findElement(By.name("Email"));
        email.sendKeys("abc@gmail.com");
        System.out.println("Email Textfield is present on the web page");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
        driver.findElement(By.className("form-control")).click();
        }finally {
        }
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
        catch(Exception e) {
        	System.out.println("Text fields not present on the web page");
        }
        driver.findElement(By.linkText("About Us")).click();

		driver.findElement(By.className("dropdown-menu"));
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
		}
        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/ul/li[4]/a")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
        
//        Checking if the name of a person is present on a web page
        if ( driver.getPageSource().contains("Priyesh Kumar")){
        	System.out.println("Given ame is present on the web page");
//        Verifying the presence of the image of the person if the corresponding name of the person is present on the web page
        	WebElement ImageFile1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/a/img"));
            
            Boolean ImagePresent1 = (Boolean) js.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile1);
           
            if (!ImagePresent1)
            {
                 System.out.println("Image not displayed.");
            }
            else {
            	System.out.println("Image corresponding to the name is present on the web page");
            }
         } else {
            System.out.println("Data not found");
         }
        
        if ( driver.getPageSource().contains("Tanwi Kaushik")){
        	System.out.println("Given name is present on the web page");
        	
        	WebElement ImageFile2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/a/img"));
            
            Boolean ImagePresent2 = (Boolean) js.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile2);
           
            if (!ImagePresent2)
            {
                 System.out.println("Image not displayed.");
            }
            else {
            	System.out.println("Image corresponding to the name is present on the web page");
            }
         } 
        else {
            System.out.println("Data not found");
         }
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
        driver.close();
  }   
    } 
