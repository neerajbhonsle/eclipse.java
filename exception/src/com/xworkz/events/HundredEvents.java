package com.xworkz.events;

import java.awt.AWTError;
import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.color.CMMException;
import java.awt.geom.IllegalPathStateException;
import java.awt.image.ImagingOpException;
import java.io.IOError;
import java.io.IOException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.invoke.LambdaConversionException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.rmi.AlreadyBoundException;
import java.rmi.activation.ActivationException;
import java.security.GeneralSecurityException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.security.cert.CertificateException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.IllformedLocaleException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;
import java.util.zip.ZipError;

import javax.lang.model.type.MirroredTypesException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.IntrospectionException;
import javax.management.InvalidApplicationException;
import javax.management.JMException;
import javax.management.JMRuntimeException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.bind.DataBindingException;
import javax.xml.bind.JAXBException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.ietf.jgss.GSSException;
import org.omg.CORBA.portable.ApplicationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

public class HundredEvents {
	// Running RUNTIMEEXCEPTIONS EVENTS

	public void method1() {
		System.out.println("running method1");
		throw new RuntimeException("");
	}

	public void method2() {
		System.out.println("running method2");
		throw new AnnotationTypeMismatchException(null, null);
	}

	public void method3() {
		System.out.println("running method3");
		throw new ArithmeticException();
	}

	public void method4() {
		System.out.println("running method4");
		throw new ArrayStoreException();
	}

	public void method5() {
		System.out.println("running method5");
		throw new BufferOverflowException();
	}

	public void method6() {
		System.out.println("running method6");
		throw new BufferUnderflowException();
	}

	public void method7() {
		System.out.println("running method7");
		throw new CannotRedoException();
	}

	public void method8() {
		System.out.println("running method8");
		throw new CannotUndoException();
	}

	public void method9() {
		System.out.println("running method9");
		throw new ClassCastException();
	}

	public void method10() {
		System.out.println("running method10");
		throw new CMMException(null);
	}

	public void method11() {
		System.out.println("running method11");
		throw new ConcurrentModificationException();
	}

	public void method12() {
		System.out.println("running method12");
		throw new DataBindingException(null);
	}

	public void method13() {
		System.out.println("running method13");
		throw new DOMException((short) 0, null);
	}

	public void method14() {
		System.out.println("running method14");
		throw new EmptyStackException();
	}

	public void method15() {
		System.out.println("running method15");
		throw new EnumConstantNotPresentException(null, null);
	}

	public void method16() {
		System.out.println("running method16");
		throw new EventException((short) 0, null);
	}

	public void method17() {
		System.out.println("running method17");
		throw new FileSystemAlreadyExistsException();
	}

	public void method18() {
		System.out.println("running method18");
		throw new FileSystemNotFoundException();
	}

	public void method19() {
		System.out.println("running method19");
		throw new IllegalArgumentException();
	}

	public void method20() {
		System.out.println("running method20");
		throw new IllegalMonitorStateException();
	}

	public void method21() {
		System.out.println("running method21");
		throw new IllegalPathStateException();
	}

	public void method22() {
		System.out.println("running method22");
		throw new IllegalStateException();
	}

	public void method23() {
		System.out.println("running method23");
		throw new IllformedLocaleException();
	}

	public void method24() {
		System.out.println("running method24");
		throw new ImagingOpException(null);
	}

	public void method25() {
		System.out.println("running method25");
		throw new IncompleteAnnotationException(null, null);
	}

	public void method26() {
		System.out.println("running method26");
		throw new IndexOutOfBoundsException();
	}

	public void method27() {
		System.out.println("running method27");
		throw new JMRuntimeException();
	}

	public void method28() {
		System.out.println("running method28");
		throw new LSException((short) 0, null);
	}

	public void method29() {
		System.out.println("running method29");
		throw new MalformedParameterizedTypeException();
	}

	public void method30() {
		System.out.println("running method30");
		throw new MirroredTypesException(null);
	}

	public void method31() {
		System.out.println("running method31");
		throw new MissingResourceException(null, null, null);
	}

	public void method32() {
		System.out.println("running method32");
		throw new NegativeArraySizeException();
	}

	public void method33() {
		System.out.println("running method33");
		throw new NoSuchElementException();
	}

	public void method34() {
		System.out.println("running method34");
		throw new NoSuchMechanismException();
	}

	public void method35() {
		System.out.println("running method35");
		throw new NullPointerException();
	}

	// running EXCEPTION EVENTS
	public void method36() throws AclNotFoundException {
		System.out.println("running method37");
		throw new AclNotFoundException();
	}

	public void method37() throws ActivationException {
		System.out.println("running method37");
		throw new ActivationException();
	}

	public void method38() throws AlreadyBoundException {
		System.out.println("running method38");
		throw new AlreadyBoundException();
	}

	public void method39() throws ApplicationException {
		System.out.println("running method39");
		throw new ApplicationException(null, null);
	}

	public void method40() throws AWTException {
		System.out.println("running method40");
		throw new AWTException(null);
	}

	public void method41() throws BackingStoreException {
		System.out.println("running method41");
		throw new BackingStoreException(" ");
	}

	public void method42() throws BadAttributeValueExpException {
		System.out.println("running method42");
		throw new BadAttributeValueExpException(getClass());
	}

	public void method43() throws BadBinaryOpValueExpException {
		System.out.println("running method43");
		throw new BadBinaryOpValueExpException(null);
	}

	public void method44() throws BadLocationException {
		System.out.println("running method44");
		throw new BadLocationException(null, 0);
	}

	public void method45() throws BadStringOperationException {
		System.out.println("running method45");
		throw new BadStringOperationException(null);
	}

	public void method46() throws BrokenBarrierException {
		System.out.println("running method46");
		throw new BrokenBarrierException();
	}

	public void method47() throws CertificateException {
		System.out.println("running method47");
		throw new CertificateException();
	}

	public void method48() throws CloneNotSupportedException {
		System.out.println("running method48");
		throw new CloneNotSupportedException();
	}

	public void method49() throws DataFormatException {
		System.out.println("running method49");
		throw new DataFormatException();
	}

	public void method50() throws DatatypeConfigurationException {
		System.out.println("running method50");
		throw new DatatypeConfigurationException();
	}

	public void method51() throws DestroyFailedException {
		System.out.println("running method51");
		throw new DestroyFailedException();
	}

	public void method52() throws ExecutionException {
		System.out.println("running method52");
		throw new ExecutionException(null);
	}

	public void method53() throws ExpandVetoException {
		System.out.println("running method53");
		throw new ExpandVetoException(null);
	}

	public void method54() throws FontFormatException {
		System.out.println("running method54");
		throw new FontFormatException(null);
	}

	public void method55() throws GeneralSecurityException {
		System.out.println("running method55");
		throw new GeneralSecurityException();
	}

	public void method56() throws GSSException {
		System.out.println("running method56");
		throw new GSSException(0);
	}

	public void method57() throws IllegalClassFormatException {
		System.out.println("running method57");
		throw new IllegalClassFormatException();
	}

	public void method58() throws InterruptedException {
		System.out.println("running method58");
		throw new InterruptedException();
	}

	public void method59() throws IntrospectionException {
		System.out.println("running method59");
		throw new IntrospectionException();
	}

	public void method60() throws InvalidApplicationException {
		System.out.println("running method60");
		throw new InvalidApplicationException(getClass());
	}

	public void method61() throws InvalidMidiDataException {
		System.out.println("running method61");
		throw new InvalidMidiDataException();
	}

	public void method62() throws InvalidPreferencesFormatException {
		System.out.println("running method62");
		throw new InvalidPreferencesFormatException(" ");
	}

	public void method63() throws InvalidTargetObjectTypeException {
		System.out.println("running method63");
		throw new InvalidTargetObjectTypeException();
	}

	public void method64() throws IOException {
		System.out.println("running method64");
		throw new IOException();
	}

	public void method65() throws JAXBException {
		System.out.println("running method65");
		throw new JAXBException(" ");
	}

	public void method66() throws JMException {
		System.out.println("running method66");
		throw new JMException();
	}

	public void method67() throws KeySelectorException {
		System.out.println("running method67");
		throw new KeySelectorException();
	}

	public void method68() throws LambdaConversionException {
		System.out.println("running method68");
		throw new LambdaConversionException();
	}

	public void method69() throws LastOwnerException {
		System.out.println("running method69");
		throw new LastOwnerException();
	}

	public void method70() throws LineUnavailableException {
		System.out.println("running method70");
		throw new LineUnavailableException();
	}

	// Running ERROR EVENTS
	public void method71() {
		System.out.println("running method71");
		throw new AnnotationFormatError(" ");
	}

	public void method72() {
		System.out.println("running method72");
		throw new AssertionError();
	}

	public void method73() {
		System.out.println("running method73");
		throw new AWTError(null);
	}

	public void method74() {
		System.out.println("running method74");
		throw new CoderMalfunctionError(null);
	}

	public void method75() {
		System.out.println("running method75");
		throw new FactoryConfigurationError();
	}

	public void method76() {
		System.out.println("running method76");
		throw new FactoryConfigurationError();
	}

	public void method77() {
		System.out.println("running method77");
		throw new IOError(null);
	}

	public void method78() {
		System.out.println("running method78");
		throw new LinkageError();
	}

	public void method79() {
		System.out.println("running method79");
		throw new BootstrapMethodError();
	}

	public void method80() {
		System.out.println("running method80");
		throw new ClassCircularityError();
	}

	public void method81() {
		System.out.println("running method81");
		throw new ClassFormatError();
	}

	public void method82() {
		System.out.println("running method82");
		throw new GenericSignatureFormatError();
	}

	public void method83() {
		System.out.println("running method83");
		throw new UnsupportedClassVersionError();
	}

	public void method84() {
		System.out.println("running method84");
		throw new ExceptionInInitializerError();
	}

	public void method85() {
		System.out.println("running method85");
		throw new IncompatibleClassChangeError();
	}

	public void method86() {
		System.out.println("running method86");
		throw new AbstractMethodError();
	}

	public void method87() {
		System.out.println("running method87");
		throw new IllegalAccessError();
	}

	public void method88() {
		System.out.println("running method88");
		throw new InstantiationError();
	}

	public void method89() {
		System.out.println("running method89");
		throw new NoSuchFieldError();
	}

	public void method90() {
		System.out.println("running method90");
		throw new NoSuchMethodError();
	}

	public void method91() {
		System.out.println("running method91");
		throw new NoClassDefFoundError();
	}

	public void method92() {
		System.out.println("running method92");
		throw new UnsatisfiedLinkError();
	}

	public void method93() {
		System.out.println("running method93");
		throw new VerifyError();
	}

	public void method94() {
		System.out.println("running method94");
		throw new ZipError(null);
	}

	public void method95() {
		System.out.println("running method95");
		throw new ThreadDeath();
	}

	public void method96() {
		System.out.println("running method96");
		throw new TransformerFactoryConfigurationError();
	}

	public void method97() {
		System.out.println("running method97");
		throw new OutOfMemoryError();
	}

	public void method98() {
		System.out.println("running method98");
		throw new InternalError();
	}

	public void method99() {
		System.out.println("running method99");
		throw new StackOverflowError();
	}

	public void method100() {
		System.out.println("running method100");
		throw new UnknownError();
	}

}