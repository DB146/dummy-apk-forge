package f;

import c.C0865i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: f.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1124h extends AbstractC1119c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0865i f16915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16916c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.c f16917d;

    public /* synthetic */ C1124h(C0865i c0865i, String str, com.bumptech.glide.c cVar, int i7) {
        this.f16914a = i7;
        this.f16915b = c0865i;
        this.f16916c = str;
        this.f16917d = cVar;
    }

    @Override // f.AbstractC1119c
    public final void a(Object obj) {
        switch (this.f16914a) {
            case 0:
                C0865i c0865i = this.f16915b;
                LinkedHashMap linkedHashMap = c0865i.f14032b;
                String str = this.f16916c;
                Object obj2 = linkedHashMap.get(str);
                com.bumptech.glide.c cVar = this.f16917d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + cVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue = ((Number) obj2).intValue();
                ArrayList arrayList = c0865i.f14034d;
                arrayList.add(str);
                try {
                    c0865i.b(intValue, cVar, obj);
                    return;
                } catch (Exception e2) {
                    arrayList.remove(str);
                    throw e2;
                }
            default:
                C0865i c0865i2 = this.f16915b;
                LinkedHashMap linkedHashMap2 = c0865i2.f14032b;
                String str2 = this.f16916c;
                Object obj3 = linkedHashMap2.get(str2);
                com.bumptech.glide.c cVar2 = this.f16917d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + cVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue2 = ((Number) obj3).intValue();
                ArrayList arrayList2 = c0865i2.f14034d;
                arrayList2.add(str2);
                try {
                    c0865i2.b(intValue2, cVar2, obj);
                    return;
                } catch (Exception e10) {
                    arrayList2.remove(str2);
                    throw e10;
                }
        }
    }

    public void b() {
        this.f16915b.f(this.f16916c);
    }
}
