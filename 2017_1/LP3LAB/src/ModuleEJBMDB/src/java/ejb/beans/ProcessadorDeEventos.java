/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.beans;

import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author rb
 */

@MessageDriven(name = "EventMDB", activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
    @ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/jms/queue/eventQueue"),
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto- acknowledge")})
public class ProcessadorDeEventos implements MessageListener {

    private final static Logger LOGGER = Logger.getLogger(ProcessadorDeEventos.class.toString());

    public ProcessadorDeEventos() {
    }

    @Override
    public void onMessage(Message message) {
        TextMessage msg = null;
        try {
            if (message instanceof TextMessage) {
                msg = (TextMessage) message;
                System.out.println("Mensagem recebida da fila: " + msg.getText());
            } else {
                System.out.println("Mensagem de tipo não esperado: " + message.getClass().getName());

            }
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
    }
}
