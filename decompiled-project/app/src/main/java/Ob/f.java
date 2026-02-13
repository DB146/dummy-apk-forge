package Ob;

import Eb.AbstractC0251b;
import java.io.File;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class f extends AbstractC0251b {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f7549c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f7550d;

    public f(h hVar) {
        this.f7550d = hVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f7549c = arrayDeque;
        boolean isDirectory = ((File) hVar.f7553b).isDirectory();
        File file = (File) hVar.f7553b;
        if (isDirectory) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            arrayDeque.push(new g(file));
        } else {
            this.f3870a = 2;
        }
    }

    @Override // Eb.AbstractC0251b
    public final void a() {
        File file;
        File a9;
        while (true) {
            ArrayDeque arrayDeque = this.f7549c;
            g gVar = (g) arrayDeque.peek();
            if (gVar != null) {
                a9 = gVar.a();
                if (a9 != null) {
                    if (a9.equals(gVar.f7551a) || !a9.isDirectory()) {
                        break;
                    }
                    int size = arrayDeque.size();
                    this.f7550d.getClass();
                    if (size >= Integer.MAX_VALUE) {
                        break;
                    } else {
                        arrayDeque.push(b(a9));
                    }
                } else {
                    arrayDeque.pop();
                }
            } else {
                file = null;
                break;
            }
        }
        file = a9;
        if (file == null) {
            this.f3870a = 2;
        } else {
            this.f3871b = file;
            this.f3870a = 1;
        }
    }

    public final b b(File file) {
        int ordinal = ((i) this.f7550d.f7554c).ordinal();
        if (ordinal == 0) {
            return new e(this, file);
        }
        if (ordinal == 1) {
            return new c(this, file);
        }
        throw new Db.d(1);
    }
}
