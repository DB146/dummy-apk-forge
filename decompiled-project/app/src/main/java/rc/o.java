package rc;

import Y5.C0660y;
import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class o implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public static final w f23980a;

    /* renamed from: b, reason: collision with root package name */
    public static final sc.e f23981b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [rc.w] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r02;
        try {
            Class.forName("java.nio.file.Files");
            r02 = new Object();
        } catch (ClassNotFoundException unused) {
            r02 = new Object();
        }
        f23980a = r02;
        String str = z.f24006b;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.l.d(property, "getProperty(...)");
        C0660y.a(property, false);
        ClassLoader classLoader = sc.e.class.getClassLoader();
        kotlin.jvm.internal.l.d(classLoader, "getClassLoader(...)");
        f23981b = new sc.e(classLoader);
    }

    public abstract v F(z zVar);

    public abstract H K(z zVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final boolean l(z path) {
        kotlin.jvm.internal.l.e(path, "path");
        return n(path) != null;
    }

    public abstract I2.A n(z zVar);
}
