package sc;

import A9.N2;
import I2.A;
import Y5.C0658x;
import Y5.C0660y;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import kotlin.jvm.internal.l;
import rc.C1960d;
import rc.H;
import rc.o;
import rc.v;
import rc.w;
import rc.z;

/* loaded from: classes2.dex */
public final class e extends o {

    /* renamed from: f, reason: collision with root package name */
    public static final z f24367f;

    /* renamed from: c, reason: collision with root package name */
    public final ClassLoader f24368c;

    /* renamed from: d, reason: collision with root package name */
    public final o f24369d;

    /* renamed from: e, reason: collision with root package name */
    public final Db.o f24370e;

    static {
        String str = z.f24006b;
        f24367f = C0660y.a("/", false);
    }

    public e(ClassLoader classLoader) {
        w systemFileSystem = o.f23980a;
        l.e(systemFileSystem, "systemFileSystem");
        this.f24368c = classLoader;
        this.f24369d = systemFileSystem;
        this.f24370e = android.support.v4.media.session.b.z(new N2(this, 29));
    }

    @Override // rc.o
    public final v F(z zVar) {
        if (!C0658x.a(zVar)) {
            throw new FileNotFoundException("file not found: " + zVar);
        }
        z zVar2 = f24367f;
        zVar2.getClass();
        String E10 = c.b(zVar2, zVar, true).f(zVar2).f24007a.E();
        for (Db.j jVar : (List) this.f24370e.getValue()) {
            try {
                return ((o) jVar.f3354a).F(((z) jVar.f3355b).g(E10));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + zVar);
    }

    @Override // rc.o
    public final H K(z file) {
        l.e(file, "file");
        if (!C0658x.a(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        z zVar = f24367f;
        zVar.getClass();
        URL resource = this.f24368c.getResource(c.b(zVar, file, false).f(zVar).f24007a.E());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        l.d(inputStream, "getInputStream(...)");
        return new C1960d(1, inputStream, new Object());
    }

    @Override // rc.o
    public final A n(z path) {
        l.e(path, "path");
        if (!C0658x.a(path)) {
            return null;
        }
        z zVar = f24367f;
        zVar.getClass();
        String E10 = c.b(zVar, path, true).f(zVar).f24007a.E();
        for (Db.j jVar : (List) this.f24370e.getValue()) {
            A n6 = ((o) jVar.f3354a).n(((z) jVar.f3355b).g(E10));
            if (n6 != null) {
                return n6;
            }
        }
        return null;
    }
}
