package Ob;

import java.io.File;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f7539b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f7540c;

    /* renamed from: d, reason: collision with root package name */
    public int f7541d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f7543f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, File file) {
        super(file);
        this.f7543f = fVar;
    }

    @Override // Ob.g
    public final File a() {
        boolean z8 = this.f7542e;
        File file = this.f7551a;
        f fVar = this.f7543f;
        if (!z8 && this.f7540c == null) {
            fVar.f7550d.getClass();
            File[] listFiles = file.listFiles();
            this.f7540c = listFiles;
            if (listFiles == null) {
                fVar.f7550d.getClass();
                this.f7542e = true;
            }
        }
        File[] fileArr = this.f7540c;
        if (fileArr != null && this.f7541d < fileArr.length) {
            l.b(fileArr);
            int i7 = this.f7541d;
            this.f7541d = i7 + 1;
            return fileArr[i7];
        }
        if (this.f7539b) {
            fVar.f7550d.getClass();
            return null;
        }
        this.f7539b = true;
        return file;
    }
}
