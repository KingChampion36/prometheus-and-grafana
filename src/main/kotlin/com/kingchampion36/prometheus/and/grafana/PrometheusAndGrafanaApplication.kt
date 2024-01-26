package com.kingchampion36.prometheus.and.grafana

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class PrometheusAndGrafanaApplication

fun main(args: Array<String>) {
  runApplication<PrometheusAndGrafanaApplication>(*args)
}
