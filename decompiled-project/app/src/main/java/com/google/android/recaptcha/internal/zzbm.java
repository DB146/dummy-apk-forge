package com.google.android.recaptcha.internal;

import Eb.o;
import Eb.p;
import Xb.a;
import Xb.b;
import ac.n;
import android.content.Context;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class zzbm implements zzaq {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbm(Context context) {
        this.zza = context;
        new zzcd(context);
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzb() {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    if (n.Y(file.getName(), this.zzb, false)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzc(String str, String str2) {
        a aVar = new a('A', 'z');
        ArrayList arrayList = new ArrayList(p.S(aVar, 10));
        Iterator it = aVar.iterator();
        while (((b) it).f11023c) {
            b bVar = (b) it;
            int i7 = bVar.f11024d;
            if (i7 != bVar.f11022b) {
                bVar.f11024d = bVar.f11021a + i7;
            } else {
                if (!bVar.f11023c) {
                    throw new NoSuchElementException();
                }
                bVar.f11023c = false;
            }
            arrayList.add(Character.valueOf((char) i7));
        }
        List v02 = o.v0(arrayList);
        Collections.shuffle(v02);
        String d02 = o.d0(((ArrayList) v02).subList(0, 8), "", null, null, null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(d02)));
        zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final boolean zzd(String str) {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (listFiles != null) {
                int length = listFiles.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    File file2 = listFiles[i7];
                    if (l.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i7++;
                }
            }
            return file != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
