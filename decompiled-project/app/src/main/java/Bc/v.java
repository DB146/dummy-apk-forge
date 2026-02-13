package Bc;

import java.io.InputStream;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;

/* loaded from: classes2.dex */
public final class v implements q {

    /* renamed from: a, reason: collision with root package name */
    public final XMLInputFactory f2323a = XMLInputFactory.newInstance();

    /* JADX WARN: Type inference failed for: r0v1, types: [Bc.z, Bc.i, java.lang.Object] */
    @Override // Bc.q
    public final i a(InputStream inputStream) {
        XMLEventReader createXMLEventReader = this.f2323a.createXMLEventReader(inputStream);
        ?? obj = new Object();
        obj.f2327a = createXMLEventReader;
        return obj;
    }
}
