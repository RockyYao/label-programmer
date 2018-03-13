package com.muban.service;

import com.muban.pojo.BoxSum;
import com.muban.pojo.Labeljob;
import com.muban.pojo.Labeltoprint;

public interface LabelPrintService {

Labeltoprint findTrwALL(String workorder);

void pringLabel(Labeljob labeljob,Labeltoprint labeltoprint);

BoxSum boxSumGet(String workorder);
}
