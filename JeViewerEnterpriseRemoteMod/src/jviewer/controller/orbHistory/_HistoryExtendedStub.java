package jviewer.controller.orbHistory;


/**
* jviewer/controller/orbHistory/_HistoryExtendedStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ControllerHistory.idl
* Sunday, November 18, 2012 7:59:07 PM MSK
*/

public class _HistoryExtendedStub extends org.omg.CORBA.portable.ObjectImpl implements jviewer.controller.orbHistory.HistoryExtended
{

  public boolean loginExt (String login, String password, jviewer.controller.orbHistory.HistoryExtendedPackage.ClientInfoHolder clientInfo, org.omg.CORBA.StringHolder strResult)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("loginExt", true);
                $out.write_string (login);
                $out.write_string (password);
                jviewer.controller.orbHistory.HistoryExtendedPackage.ClientInfoHelper.write ($out, clientInfo.value);
                $out.write_string (strResult.value);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                clientInfo.value = jviewer.controller.orbHistory.HistoryExtendedPackage.ClientInfoHelper.read ($in);
                strResult.value = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return loginExt (login, password, clientInfo, strResult        );
            } finally {
                _releaseReply ($in);
            }
  } // loginExt

  public void shutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown

  public String[] getHistory (int clientId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getHistory", true);
                $out.write_long (clientId);
                $in = _invoke ($out);
                String $result[] = jviewer.controller.orbHistory.HistoryPackage.historyHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getHistory (clientId        );
            } finally {
                _releaseReply ($in);
            }
  } // getHistory

  public boolean login (String login, String password)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("login", true);
                $out.write_string (login);
                $out.write_string (password);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return login (login, password        );
            } finally {
                _releaseReply ($in);
            }
  } // login

  public boolean logout (int clientId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("logout", true);
                $out.write_long (clientId);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return logout (clientId        );
            } finally {
                _releaseReply ($in);
            }
  } // logout

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:jviewer/controller/orbHistory/HistoryExtended:1.0", 
    "IDL:jviewer/controller/orbHistory/History:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _HistoryExtendedStub
