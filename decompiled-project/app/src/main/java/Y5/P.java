package Y5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class P extends H {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f11518e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* renamed from: c, reason: collision with root package name */
    public final C0630l f11519c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11520d;

    public P(C0646q0 c0646q0) {
        super(c0646q0);
        this.f11519c = new C0630l(this, ((C0646q0) this.f3094a).f11907a);
    }

    @Override // Y5.H
    public final boolean M() {
        return false;
    }

    public final void N() {
        int delete;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        J();
        try {
            SQLiteDatabase P10 = P();
            if (P10 == null || (delete = P10.delete("messages", null, null)) <= 0) {
                return;
            }
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11573B.b(Integer.valueOf(delete), "Reset local analytics data. records");
        } catch (SQLiteException e2) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11577f.b(e2, "Error resetting local analytics data. error");
        }
    }

    public final boolean O() {
        J();
        if (!this.f11520d) {
            C0646q0 c0646q0 = (C0646q0) this.f3094a;
            if (c0646q0.f11907a.getDatabasePath("google_app_measurement_local.db").exists()) {
                int i7 = 0;
                int i10 = 5;
                while (true) {
                    if (i7 >= 5) {
                        W w10 = c0646q0.f11912f;
                        C0646q0.l(w10);
                        w10.f11580w.a("Error deleting app launch break from local database in reasonable time");
                        break;
                    }
                    SQLiteDatabase sQLiteDatabase = null;
                    try {
                        SQLiteDatabase P10 = P();
                        if (P10 != null) {
                            P10.beginTransaction();
                            P10.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            P10.setTransactionSuccessful();
                            P10.endTransaction();
                            P10.close();
                            return true;
                        }
                        this.f11520d = true;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i10);
                        i10 += 20;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    } catch (SQLiteFullException e2) {
                        W w11 = c0646q0.f11912f;
                        C0646q0.l(w11);
                        w11.f11577f.b(e2, "Error deleting app launch break from local database");
                        this.f11520d = true;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    } catch (SQLiteException e10) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        W w12 = c0646q0.f11912f;
                        C0646q0.l(w12);
                        w12.f11577f.b(e10, "Error deleting app launch break from local database");
                        this.f11520d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                    i7++;
                }
            }
        }
        return false;
    }

    public final SQLiteDatabase P() {
        if (this.f11520d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f11519c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f11520d = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q(int i7, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        J();
        boolean z8 = false;
        z8 = false;
        if (!this.f11520d) {
            C0646q0 c0646q0 = (C0646q0) this.f3094a;
            C0615g c0615g = c0646q0.f11910d;
            E e2 = F.f11312c1;
            Cursor cursor2 = null;
            O1 N10 = c0615g.T(null, e2) ? c0646q0.q().N(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i7));
            contentValues.put("entry", bArr);
            if (c0646q0.f11910d.T(null, e2) && N10 != null) {
                contentValues.put("app_version", N10.f11508c);
                contentValues.put("app_version_int", Long.valueOf(N10.f11515x));
            }
            int i10 = 5;
            int i11 = 0;
            int i12 = 5;
            while (true) {
                W w10 = c0646q0.f11912f;
                if (i11 >= i10) {
                    C0646q0.l(w10);
                    w10.f11573B.a("Failed to write entry to local database");
                    return false;
                }
                try {
                    sQLiteDatabase = P();
                    if (sQLiteDatabase == null) {
                        this.f11520d = true;
                        break;
                    }
                    try {
                        sQLiteDatabase.beginTransaction();
                        cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                        long j = 0;
                        if (cursor != null) {
                            try {
                                if (cursor.moveToFirst()) {
                                    j = cursor.getLong(z8 ? 1 : 0);
                                }
                            } catch (SQLiteDatabaseLockedException unused) {
                                SystemClock.sleep(i12);
                                i12 += 20;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase == null) {
                                    i11++;
                                    z8 = false;
                                    i10 = 5;
                                }
                                sQLiteDatabase.close();
                                i11++;
                                z8 = false;
                                i10 = 5;
                            } catch (SQLiteFullException e10) {
                                e = e10;
                                C0646q0.l(w10);
                                w10.f11577f.b(e, "Error writing entry; local database full");
                                this.f11520d = true;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase == null) {
                                    i11++;
                                    z8 = false;
                                    i10 = 5;
                                }
                                sQLiteDatabase.close();
                                i11++;
                                z8 = false;
                                i10 = 5;
                            } catch (SQLiteException e11) {
                                e = e11;
                                if (sQLiteDatabase != null) {
                                    try {
                                        if (sQLiteDatabase.inTransaction()) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                }
                                C0646q0.l(w10);
                                w10.f11577f.b(e, "Error writing entry to local database");
                                this.f11520d = true;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase == null) {
                                    i11++;
                                    z8 = false;
                                    i10 = 5;
                                }
                                sQLiteDatabase.close();
                                i11++;
                                z8 = false;
                                i10 = 5;
                            }
                        }
                        if (j >= 100000) {
                            C0646q0.l(w10);
                            U u3 = w10.f11577f;
                            u3.a("Data loss, local db full");
                            long j10 = 100001 - j;
                            long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j10)});
                            if (delete != j10) {
                                C0646q0.l(w10);
                                u3.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j10), Long.valueOf(delete), Long.valueOf(j10 - delete));
                            }
                        }
                        sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        if (cursor != null) {
                            cursor.close();
                        }
                        sQLiteDatabase.close();
                        return true;
                    } catch (SQLiteDatabaseLockedException unused2) {
                        cursor = null;
                    } catch (SQLiteFullException e12) {
                        e = e12;
                        cursor = null;
                    } catch (SQLiteException e13) {
                        e = e13;
                        cursor = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor2 != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                } catch (SQLiteDatabaseLockedException unused3) {
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteFullException e14) {
                    e = e14;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteException e15) {
                    e = e15;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase = null;
                }
                i11++;
                z8 = false;
                i10 = 5;
            }
        }
        return z8;
    }
}
