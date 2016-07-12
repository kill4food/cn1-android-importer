package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class MessageContainer extends Container  {
    public MessageContainer(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_messagecontent = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_messageunsignedcontainer = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui__2 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui__3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.components.SpanLabel gui_messageunsignedtext = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui_attachmentscontainer = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui_attachments = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Button gui_showhiddenattachments = new com.codename1.ui.Button();
    private com.codename1.ui.Container gui_hiddenattachments = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.FlowLayout());
        setUIID("Container3Android");
        setName("MessageContainer");
        addComponent(gui_messagecontent);
        addComponent(gui_messageunsignedcontainer);
        gui_messageunsignedcontainer.setUIID("Container3Android");
        gui_messageunsignedcontainer.setName("messageunsignedcontainer");
        gui_messageunsignedcontainer.addComponent(gui_);
        gui_.setUIID("Container3Android");
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui_.addComponent(gui__2);
        gui_.addComponent(gui__3);
        gui__1.setUIID("Container3Android");
        gui__1.setName("_1");
        gui__2.setText("Unsigned Text");
        gui__2.setUIID("Label10Android");
        gui__2.setName("_2");
        gui__3.setUIID("Container3Android");
        gui__3.setName("_3");
        gui_messageunsignedcontainer.addComponent(gui_messageunsignedtext);
        gui_.setUIID("Container3Android");
        gui_.setName("");
        gui_messageunsignedtext.setUIID("SpanLabel37Android");
        gui_messageunsignedtext.setName("messageunsignedtext");
        addComponent(gui_attachmentscontainer);
        gui_attachmentscontainer.setUIID("Container3Android");
        gui_attachmentscontainer.setName("attachmentscontainer");
        gui_attachmentscontainer.addComponent(gui_attachments);
        gui_attachmentscontainer.addComponent(gui_showhiddenattachments);
        gui_attachmentscontainer.addComponent(gui_hiddenattachments);
        gui_attachments.setUIID("Container3Android");
        gui_attachments.setName("attachments");
        gui_showhiddenattachments.setText("message_view_show_more_attachments_action");
        gui_showhiddenattachments.setUIID("Button20Android");
        gui_showhiddenattachments.setName("showhiddenattachments");
        gui_hiddenattachments.setUIID("Container3Android");
        gui_hiddenattachments.setName("hiddenattachments");
        gui_messagecontent.setUIID("Container3Android");
        gui_messagecontent.setName("messagecontent");
        gui_messageunsignedcontainer.setUIID("Container3Android");
        gui_messageunsignedcontainer.setName("messageunsignedcontainer");
        gui_attachmentscontainer.setUIID("Container3Android");
        gui_attachmentscontainer.setName("attachmentscontainer");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}