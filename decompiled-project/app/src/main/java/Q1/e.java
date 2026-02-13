package Q1;

import Db.q;
import Y5.C0660y;
import java.io.File;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import rc.z;

/* loaded from: classes.dex */
public final class e extends m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f8610b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(int i7, Rb.a aVar) {
        super(0);
        this.f8609a = i7;
        switch (i7) {
            case 1:
                this.f8610b = (m) aVar;
                super(0);
                return;
            default:
                this.f8610b = (m) aVar;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Rb.a, kotlin.jvm.internal.m] */
    @Override // Rb.a
    public final Object invoke() {
        ?? r02 = this.f8610b;
        switch (this.f8609a) {
            case 0:
                File file = (File) r02.invoke();
                if (Ob.j.J(file).equals("preferences_pb")) {
                    String str = z.f24006b;
                    File absoluteFile = file.getAbsoluteFile();
                    l.d(absoluteFile, "file.absoluteFile");
                    return C0660y.b(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            default:
                r02.invoke();
                return q.f3365a;
        }
    }
}
