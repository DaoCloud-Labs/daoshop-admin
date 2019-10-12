package io.daocloud.shop.admin;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.spy;

import io.daocloud.shop.admin.controller.ImageController;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminApplicationTests {

  private ImageController imageController;

  @Before
  public void setUp() throws Exception {
    System.setProperty("apollo.configService","http://localhost:8080");
    imageController =  spy(new ImageController());
  }

  @Test
  public void getPicture() throws Exception {
    List<String> stringList = imageController.getImgUrl();
    assertNull(stringList);
  }

  @Test
  public void getString(){

  }

}
