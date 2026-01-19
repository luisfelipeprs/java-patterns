package app.basicsyntax;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Service {
  void executar(String message);

  String getData();
}

class RealService implements Service {
  @Override
  public void executar(String mensagem) {
    System.out.println("Executing");
  }

  @Override
  public String getData() {
    return "Data here ur dumbass";
  }
}

class HandlerInvoke implements InvocationHandler {
  private Object realObject;

  HandlerInvoke(Object realObject) {
    this.realObject = realObject;
  }

  /**
   * teste
   * 
   * @param proxy alteração foda
   */
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("before call");
    Object result = method.invoke(realObject, args);
    System.out.println("after call ");
    System.out.println("result here: " + result);
    return result;
  }
}

public class ImplementProxy {
  public static void main(String[] args) {
    Service realService = new RealService();

    Service proxy = (Service) Proxy.newProxyInstance(
        Service.class.getClassLoader(),
        new Class[] { Service.class },
        new HandlerInvoke(realService));

    proxy.executar("message badass");
    String dataString = proxy.getData();
    System.out.println(dataString);
  }
}
