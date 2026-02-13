package Ob;

import java.io.File;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class e extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f7545b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f7546c;

    /* renamed from: d, reason: collision with root package name */
    public int f7547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f7548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, File file) {
        super(file);
        this.f7548e = fVar;
    }

    @Override // Ob.g
    public final File a() {
        boolean z8 = this.f7545b;
        File file = this.f7551a;
        f fVar = this.f7548e;
        if (!z8) {
            fVar.f7550d.getClass();
            this.f7545b = true;
            return file;
        }
        File[] fileArr = this.f7546c;
        if (fileArr != null && this.f7547d >= fileArr.length) {
            fVar.f7550d.getClass();
            return null;
        }
        if (fileArr == null) {
            File[] listFiles = file.listFiles();
            this.f7546c = listFiles;
            if (listFiles == null) {
                fVar.f7550d.getClass();
            }
            File[] fileArr2 = this.f7546c;
            if (fileArr2 == null || fileArr2.length == 0) {
                fVar.f7550d.getClass();
                return null;
            }
        }
        File[] fileArr3 = this.f7546c;
        l.b(fileArr3);
        int i7 = this.f7547d;
        this.f7547d = i7 + 1;
        return fileArr3[i7];
    }
}
